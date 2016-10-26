import turtle as tl

tl.title("Prueba")
tl.setup(800,800,0,0)

tl.pensize(3)
tl.penup()
tl.goto(-200,-50)
tl.pendown()
tl.begin_fill()
tl.color('blue')
tl.circle(40, steps=5)
tl.end_fill()

tl.goto(0,0)



tl.done()

