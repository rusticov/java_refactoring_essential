#!/bin/bash

MAINCLASS="com.codemanship.refactoring.legacycode.ShippingApp"
JAR=$(find target -name "*.jar" | head -n 1)

if [ -z "$JAR" ]; then
    echo "No JAR found in target/. Run mvn package first."
    exit 1
fi

echo "Using JAR: $JAR"
echo

for order_id in 1001 1002 1003; do
    echo "================================"
    echo "Running order $order_id"
    echo "================================"
    java -cp "$JAR" "$MAINCLASS" "$order_id"
    echo
done
