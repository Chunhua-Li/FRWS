/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  lchca
 * Created: Mar 17, 2024
 */

CREATE TABLE `foodInventory`(
`foodId` int NOT NULL AUTO_INCREMENT,
`foodId` int NOT NULL,
`foodName` varchar(50) DEFAULT NULL,
`foodDescription` varchar(200) DEFAULT NULL,
`foodPrice` float DEFAULT NULL,
`foodQuantity` int DEFAULT NULL,
`foodExpirationDate` DATE DEFAULT NULL,
`category` varchar(50) DEFAULT NULL,
`isSurplusFood` TINYINT(1) DEFAULT 0,
PRIMARY KEY(`inventoryId`)
)ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET =utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
