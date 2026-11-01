# Product Hierarchy UML Class Diagram

```mermaid
classDiagram
    class Product {
        <<abstract>>
        -Long id
        -String name
        -double price
        +getSummary()* String
        +getId() Long
        +getName() String
        +getPrice() double
    }
    class Discountable {
        <<interface>>
        +applyDiscount(double rate) void
        +getDiscountedPrice() double
    }
    class DigitalProduct {
        -String downloadUrl
        -double fileSizeMB
        +getSummary() String
        +applyDiscount(double rate) void
    }
    class PhysicalProduct {
        -double weightKg
        -String dimensions
        +getSummary() String
        +applyDiscount(double rate) void
    }
    Product <|-- DigitalProduct
    Product <|-- PhysicalProduct
    Discountable <|.. DigitalProduct
    Discountable <|.. PhysicalProduct
```