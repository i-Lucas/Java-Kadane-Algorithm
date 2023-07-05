# Java-Kadane-Algorithm
Implementação do algoritmo Kadane para encontrar a soma máxima de um sub-array em Java

O algoritmo de Kadane é uma técnica eficiente para encontrar a soma máxima de um subarray em um array de números inteiros. 
Ele percorre o array calculando a soma acumulada em cada posição e atualizando a soma máxima encontrada até o momento.
Caso a soma acumulada de um subarray se tornar negativa, reiniciamos a soma a partir do próximo elemento.
Dessa forma o algoritmo encontra o subarray contíguo cuja soma é máxima em uma única iteração, tornando-o eficiente em termos de tempo de execução.
