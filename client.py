from py4j.java_gateway import JavaGateway

print("Python started")

gateway = JavaGateway()
print("Connected to Java")

app = gateway.entry_point
print("Calling Java method")

result = app.add(10, 20)
print("Result from Java:", result)

gateway.close()
print("Python finished")
