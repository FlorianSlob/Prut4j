$cgProtocol = '(s/cat (s/* (s/cat (s/cat-every [i (range 1)]
                   (s/-->> discourje.examples.npb3.impl.CGThreads.CGMessage "master" ("worker" i)))
                 (s/cat-every [i (range 1)]
                   (s/-->> discourje.examples.npb3.impl.DoneMessage ("worker" i) "master"))))
     (s/cat-every [i (range 1)]
       (s/cat (s/-->> discourje.examples.npb3.impl.ExitMessage "master" ("worker" i))
              (s/-->> discourje.examples.npb3.impl.DoneMessage ("worker" i) "master")))
     (s/cat-every [i (range 1)]
       (s/close "master" ("worker" i)))
     (s/cat-every [i (range 1)]
       (s/close ("worker" i) "master")))
'

$cgProtocolAlt = '  (s/cat (s/* (s/cat (s/cat-every [i (range 1)]
                            (s/-->> discourje.examples.npb3.impl.CGThreads.CGMessage "master" ("worker" i)))
                     (s/* (s/alt-every [i (range 1)]
                            (s/-->> discourje.examples.npb3.impl.DoneMessage ("worker" i) "master")))))
         (s/* (s/alt-every [i (range 1)]
                (s/cat (s/-->> discourje.examples.npb3.impl.ExitMessage "master" ("worker" i))
                       (s/-->> discourje.examples.npb3.impl.DoneMessage ("worker" i) "master"))))
         (s/* (s/alt-every [i (range 1)]
                (s/close "master" ("worker" i))))
         (s/* (s/alt-every [i (range 1)]
                (s/close ("worker" i) "master"))))
'

$ftProtocol = '(s/cat (s/* (s/alt (s/cat (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.FTThreads.EvolveMessage "master" ("evolve" i)))
                            (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.DoneMessage ("evolve" i) "master")))
                     (s/cat (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.FTThreads.FFTMessage "master" ("fft" i)))
                            (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.DoneMessage ("fft" i) "master")))
                     (s/cat (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage "master" ("fft" i)))
                            (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.DoneMessage ("fft" i) "master")))))
         (s/cat-every [i (range 1)]
           (s/cat (s/cat (s/-->> discourje.examples.npb3.impl.ExitMessage "master" ("evolve" i))
                         (s/-->> discourje.examples.npb3.impl.DoneMessage ("evolve" i) "master"))
                  (s/cat (s/-->> discourje.examples.npb3.impl.ExitMessage "master" ("fft" i))
                         (s/-->> discourje.examples.npb3.impl.DoneMessage ("fft" i) "master"))))
         (s/cat (s/cat-every [i (range 1)]
                  (s/close "master" ("evolve" i)))
                (s/cat-every [i (range 1)]
                  (s/close ("evolve" i) "master"))
                (s/cat-every [i (range 1)]
                  (s/close "master" ("fft" i)))
                (s/cat-every [i (range 1)]
                  (s/close ("fft" i) "master"))))'

$isProtocol = '
  (s/cat (s/* (s/cat (s/cat-every [i (range 1)]
                       (s/-->> discourje.examples.npb3.impl.ISThreads.RankMessage "master" ("worker" i)))
                     (s/cat-every [i (range 1)]
                       (s/-->> discourje.examples.npb3.impl.DoneMessage ("worker" i) "master"))))
         (s/cat-every [i (range 1)]
           (s/cat (s/-->> discourje.examples.npb3.impl.ExitMessage "master" ("worker" i))
                  (s/-->> discourje.examples.npb3.impl.DoneMessage ("worker" i) "master")))
         (s/cat (s/cat-every [i (range 1)]
                  (s/close "master" ("worker" i)))
                (s/cat-every [i (range 1)]
                  (s/close ("worker" i) "master"))))

'
$mgProtocol = '  (s/cat (s/* (s/alt (s/cat (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.MGThreads.InterpMessage "master" ("interpd" i)))
                            (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.DoneMessage ("interpd" i) "master")))
                     (s/cat (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.MGThreads.PsinvMessage "master" ("psinv" i)))
                            (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.DoneMessage ("psinv" i) "master")))
                     (s/cat (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.MGThreads.RprjMessage "master" ("rprj" i)))
                            (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.DoneMessage ("rprj" i) "master")))
                     (s/cat (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.MGThreads.ResidMessage "master" ("resid" i)))
                            (s/cat-every [i (range 1)]
                              (s/-->> discourje.examples.npb3.impl.DoneMessage ("resid" i) "master")))))
         (s/cat-every [i (range 1)]
           (s/cat (s/cat (s/-->> discourje.examples.npb3.impl.ExitMessage "master" ("interpd" i))
                         (s/-->> discourje.examples.npb3.impl.DoneMessage ("interpd" i) "master"))
                  (s/cat (s/-->> discourje.examples.npb3.impl.ExitMessage "master" ("psinv" i))
                         (s/-->> discourje.examples.npb3.impl.DoneMessage ("psinv" i) "master"))
                  (s/cat (s/-->> discourje.examples.npb3.impl.ExitMessage "master" ("rprj" i))
                         (s/-->> discourje.examples.npb3.impl.DoneMessage ("rprj" i) "master"))
                  (s/cat (s/-->> discourje.examples.npb3.impl.ExitMessage "master" ("resid" i))
                         (s/-->> discourje.examples.npb3.impl.DoneMessage ("resid" i) "master"))))
         (s/cat (s/cat-every [i (range 1)]
                  (s/close "master" ("interpd" i)))
                (s/cat-every [i (range 1)]
                  (s/close ("interpd" i) "master"))
                (s/cat-every [i (range 1)]
                  (s/close "master" ("psinv" i)))
                (s/cat-every [i (range 1)]
                  (s/close ("psinv" i) "master"))
                (s/cat-every [i (range 1)]
                  (s/close "master" ("rprj" i)))
                (s/cat-every [i (range 1)]
                  (s/close ("rprj" i) "master"))
                (s/cat-every [i (range 1)]
                  (s/close "master" ("resid" i)))
                (s/cat-every [i (range 1)]
                  (s/close ("resid" i) "master"))))' 

#set these vars to generate the protocol definitions
$protocol = $cgProtocolAlt
$protocolName = 'cg'

For ($i=1; $i -le 32; $i++) {
    $shouldSaveThisToFile = $protocol.Replace('1', $i);
    echo $shouldSaveThisToFile | Out-File -Encoding ASCII -FilePath '[protocolName]\alt\[protocolName]_n_[N].dcj'.Replace('[protocolName]', $protocolName).Replace('[protocolName]', $protocolName).Replace('[N]',$i);
}


