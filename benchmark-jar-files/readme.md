Documentatie voor model-checking-benchmarks-v0.1.jar 
Dit is een 'fat' jar, hier zitten dus alle dependencies in. 

Deze jar file kan bijv. op de volgende manier gestart worden: 

> java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark -BM=CG -np3 class=B
In dit geval zal de bijgewerkte benchmark gestart worden.


De volgende parameters kunnen meegegeven worden. 
-runOriginalBenchmark  (draai de onaangeraakte Java NPB benchmark)
-runUpdatedBenchmark (draai de door ons aangepaste variant)
-BM=CG / -BM=FT / -BM=IS / -BM=MG (kies welke types er gedraaid moeten worden, alleen deze 4 nu mogelijk)

verder zijn de normale parameters van de NPB van toepassing. 

Een aantal mogelijke runs om het uitvoeren op de beoogde machine te testen kunnen zijn: 
> java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark -runOriginalBenchmark -BM=CG -np3 class=B
> java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark -BM=CG -np3 class=B
> java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np3 class=B
> java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark -runOriginalBenchmark -BM=CG -np24 class=B
> java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark -runOriginalBenchmark -BM=CG -np32 class=B
> java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark -runOriginalBenchmark -BM=FT -np2 class=A
> java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark -runOriginalBenchmark -BM=IS -np3 class=A
> java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark -runOriginalBenchmark -BM=MG -np1 class=A 
