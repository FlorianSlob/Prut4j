$repeatAfterMe = 
'import nl.florianslob.modelchecking.generated.MGProtocol_n_1;'


 For ($i=1; $i -le 26; $i++) {
    echo $repeatAfterMe.Replace('1', $i);
}
