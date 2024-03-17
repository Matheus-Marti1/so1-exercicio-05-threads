# Sistemas Operacionais I - Exercício 5 - Threads

Exercício de Threads para a matéria de Sistemas Operacionais I do curso de Análise e Desenvolvimento de Sistemas da FATEC Zona Leste

## Enunciado

No Sistema Operacional Linux, o comando para realizar uma operação de ping com 10
iterações é ping -4 -c 10 <servidor>. Fazer uma aplicação Java que rode 3 Thread em S.O.
Linux fazendo operação de ping para os servidores UOL (www.uol.com.br), Terra
(www.terra.com.br) e Google (www.google.com.br). Cada thread deve ler a saída do ping
imprimindo, a cada iteração, o nome do servidor (usar fixo: UOL, Terra ou Google) e o tempo
daquela iteração. Ao fim, deve-se exibir o nome do servidor (usar fixo: UOL, Terra ou Google)
e o tempo médio obtido pela operação. Outros Sistemas Operacionais devem ser
descartados.

## Utilização

Clone o repositório na sua máquina local, ou baixe o Zip (clicando em Code -> Download ZIP) e extraia a pasta. Importe o projeto na IDE Eclipse (File -> Open Projects from File System... -> Escolha a pasta do projeto), e execute o programa (Shift + F11 para execução normal, e F11 para debug).
