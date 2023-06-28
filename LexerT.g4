lexer grammar LexerT;

BEGIN: 'Viaje a ';
END: 'FIN';

INPUT: 'lugar recomendado ';
OUTPUT: 'viaje luego a';

VARNAME: [a-z]+;
CADENA: '"'[a-z]+'"';
INT: [0-9]+;
FLOAT: [0-9]+ ',' [0-9]+;

SENO: 'cene ';
COSENO: 'conozca ';

AND: 'y ';
OR: 'o ';

MAYOR: 'mejor ';
MENOR: 'peor ';
IGUAL: 'igual ';
NOIGUAL: 'distinto ';

WS : [ \t\r\n]+ -> skip ;
