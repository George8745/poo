import turtle as tl

t = tl.Pen()

for i in range(1,19):
	t.forward(150)

	if i % 2 == 0:
		t.left(175)
	else:
		t.left(225)
input()