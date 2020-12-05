$repeatAfterMe = 
'import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_1;' 


 For ($i=1; $i -le 24; $i++) {
    echo $repeatAfterMe.Replace('1', $i);
}
