package nl.florianslob.modelchecking.base.runtime.v2.datastructure;

public class LtlTransitionExpression {
    public LtlTransitionExpression Left;
    public LtlTransitionExpression Right;
    public LtlTransitionExpressionOperator Operator;
    public LtlTransitionExpressionAtomicProposition AtomicProposition;

    @Override
    public String toString(){
        String result = "";

        if(Left != null){
            result += Left.toString();
        }

        result += Operator.toString();

        if(Right != null){
            result += Right.toString();
        }

        if(AtomicProposition != null){
            result += AtomicProposition.toString();
        }

        return  result;
    }


    @Override
    public boolean equals(Object obj){
        if(obj.getClass() == LtlTransitionExpression.class) {
            var castedObj = (LtlTransitionExpression) obj;
            if(
                    ((castedObj.Left == null && this.Left == null) || (!(castedObj.Left == null || this.Left == null) && castedObj.Left.equals(this.Left)))
                    &&
                    ((castedObj.Right == null && this.Right == null) || (!(castedObj.Right == null || this.Right == null) && castedObj.Right.equals(this.Right)))
                    &&
                    castedObj.Operator == this.Operator
                    &&
                    ((castedObj.AtomicProposition == null && this.AtomicProposition == null) || (!(castedObj.AtomicProposition == null || this.AtomicProposition == null) && castedObj.AtomicProposition.equals(this.AtomicProposition)))
            ){
                return true;
            }
            return false;
        }else{
            return false;
        }
    }


}
