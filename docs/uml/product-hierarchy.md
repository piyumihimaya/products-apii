# Product Hierarchy UML Class Diagram

```mermaid 
classDiagram
    class Product {
        -Long id
        -String name
        -double price
        +getId() Long
        +getName() String
        +getPrice() double
    }
    class DigitalProduct {
        -String downloadUrl
        -double fileSizeMB
        +getDownloadUrl() String
        +getFileSizeMB() double
    }
    class PhysicalProduct {
        -double weightKg
        -String dimensions
        +getWeightKg() double
        +getDimensions() String
    }
    Product <|-- DigitalProduct
    Product <|-- PhysicalProduct
``` 