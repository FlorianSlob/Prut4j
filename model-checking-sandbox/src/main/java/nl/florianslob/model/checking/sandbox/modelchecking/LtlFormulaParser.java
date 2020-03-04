package nl.florianslob.model.checking.sandbox.modelchecking;

import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.*;

public class LtlFormulaParser {

    public static LtlFormula Parse(String ltlFormulaDefinitionInput) throws Exception{
        String ltlFormulaDefinition = ltlFormulaDefinitionInput.trim();

        LtlFormula currentFormula = new LtlFormula("ParsedFormula");
        LtlFormula rootFormula = currentFormula;

            for(int i=0; i<=ltlFormulaDefinition.length()-1; i++) {
            char currentChar  = ltlFormulaDefinition.charAt(i);

            boolean isNegation = false;

            if(currentChar == '!' ){
                isNegation = true;
                i++;
                currentChar = ltlFormulaDefinition.charAt(i);
            }

            if(currentChar == '('){
                currentFormula.isNegation = isNegation;
                LtlFormula nextFormula = new LtlFormula("ParsedFormula");
                nextFormula.parent = currentFormula;
                currentFormula = nextFormula;
                // TODO Start recursion.
            }else if(currentChar == ')'){
                LtlFormula handledFormula = currentFormula;

                currentFormula = currentFormula.parent;

                // Check right first, it could be a next operator.
                if(currentFormula.leftOperandFormula == null && (currentFormula.operator == null || currentFormula.operator != TemporalOperator.X)){
                    currentFormula.leftOperandFormula = handledFormula;
                }else if(currentFormula.rightOperandFormula == null){
                    currentFormula.rightOperandFormula = handledFormula;
                }else{
                    throw new Exception("Left and right ar Both already filled.");
                }

                // TODO Return from Recursion!
            }
            else if(currentChar == 'X' || currentChar == '^' || currentChar == 'v' || currentChar == 'V' || currentChar == 'U' ){
                if(currentChar == 'X' && currentFormula.operator != null) {
                    LtlFormula nextFormula = new LtlFormula("ParsedFormula");
                    nextFormula.operator = TemporalOperator.X;
                    nextFormula.isNegation = isNegation;
                    currentFormula.rightOperandFormula = nextFormula;
                    currentFormula = nextFormula;
                }else{
                    if(currentChar != 'X' && currentFormula.leftOperandFormula == null){
                        throw new Exception("Cannot use this operator with no left formula");
                    }
                    currentFormula.isNegation = isNegation;
                    currentFormula.operator = getOperator(currentChar);
                }
            } else {
                // handle atomic propositions
                AtomicProposition proposition = new AtomicProposition(""+currentChar);
                LtlFormula formulaWithAtomicProposition = new LtlFormula("formulaWithAtomicProposition");
                formulaWithAtomicProposition.atomicProposition = proposition;
                formulaWithAtomicProposition.isNegation = isNegation;

                // Check right first, it could be a next operator.
                if(currentFormula.leftOperandFormula == null && ( currentFormula.operator == null || currentFormula.operator != TemporalOperator.X)){
                    currentFormula.leftOperandFormula = formulaWithAtomicProposition;
                }else if(currentFormula.rightOperandFormula == null){
                    currentFormula.rightOperandFormula = formulaWithAtomicProposition;
                }else{
                    throw new Exception("Left and right ar Both already filled.");
                }
            }
        }

        return rootFormula;
    }

    private static TemporalOperator getOperator(char currentChar) throws Exception {
        if(currentChar == 'v'){
            return TemporalOperator.Or;
        } else if(currentChar == '^'){
            return TemporalOperator.And;
        } else if(currentChar == 'V'){
            return TemporalOperator.V;
        } else if(currentChar == 'U'){
            return TemporalOperator.U;
        } else if(currentChar == 'X'){
            return TemporalOperator.X;
        }
        else{
            throw new Exception("Opeartor not found");
        }
    }
}
