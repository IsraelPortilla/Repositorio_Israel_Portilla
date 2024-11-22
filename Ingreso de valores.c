#include<stdio.h>

char letras[20];
int entero;
float valor;

int main()
{
printf("ingrese un string, un entero y un float: \n");
scanf("%s %d %f",letras,&entero,&valor);
printf("el string ingresado es:%s\n",letras);
printf("el entero ingresado es:%d\n",entero);
printf("el float ingresado es:%f\n",valor);
return 0;
}
