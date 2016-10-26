import turtle
import math

def dibujaLinea(ttl,x1,y1,x2,y2):
	ttl.penup()
	ttl.goto(x1,y1)
	ttl.pendown()
	ttl.goto(x2,y2)
	ttl.penup()

def etiquetaPunto(ttl,x,y,etiqueta):
	ttl.penup()
	ttl.goto(x,y)
	ttl.pendown()
	ttl.write(etiqueta)
	ttl.penup()

def dibujaMarca(ttl,x,y,esVertical):
	if esVertical:
		dibujaLinea(ttl,x,y+5,x,y-5)
	else:
		dibujaLinea(ttl,x+5,y,x-5,y)

def dibujaEje(ttl):
	dibujaLinea(turtle,-400,0,400,0)
	dibujaLinea(turtle,0,-400,0,400)

	for x in [-300,-200,-100,100,200,300,400]:
		dibujaMarca(ttl,x,0,True)

	for y in [-300,-200,-100,100,200,300,400]:
		dibujaMarca(ttl,0,y,False)

def dibujaFuncion(ttl,color,funcion,min,max,pasos):
	ttl.goto(0,0)
	ttl.pensize(2)
	ttl.penup()

	x=min
	y=funcion(x)

	escalaX=x*100
	escalaY=y*100

	ttl.goto(escalaX,escalaY)
	ttl.pendown()
	ttl.color('blue')

	while x < max:
		x = x + pasos
		y = funcion(x)
		escalaX=x*100
		escalaY=y*100
		ttl.goto(escalaX,escalaY)
	ttl.penup()

def miFuncion(x):
	return x


turtle.setup(800,800,0,0)
dibujaEje(turtle)
dibujaFuncion(turtle,math.sin, -math.pi, math.pi, 0.01)
dibujaFuncion(turtle, miFuncion, -math.pi, math.pi, 0.01)
turtle.done()
