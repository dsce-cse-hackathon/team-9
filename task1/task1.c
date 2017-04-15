#include<reg52.h>
#include<stdio.h>
sbit b=P0^0;
sbit c=P0^1;
unsigned int a;
void receive()
{ 
 TMOD=0X20;
 TH1=0XFD;
 SCON=0X50;
 TR1=1;
while(RI==0);
a=SBUF;
RI=0;
}
void main()
{ 
 P0=0X00;
while(1)
{ 
 receive();
 if(a=='a')
{
 b=0;
}
if(a=='A')
b=1;
if(a=='b')
c=0;
if(a=='B')
c=1;
if(a=='C')
{ 
 b=1;c=1;
}
if(a=='d')
{  b=0;c=0;
}
}
}