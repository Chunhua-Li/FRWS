/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  lchca
 * Created: Mar 17, 2024
 */

CREATE TABLE `purchase` (
  `purchaseId` int NOT NULL AUTO_INCREMENT,
  `userId` int NOT NULL,
  `foodId` int NOT NULL,
  `foodName` varchar(50) DEFAULT NULL,
  `foodQuantity` int DEFAULT NULL,
  `foodPrice` float DEFAULT NULL,
  `userName`  varchar(50) DEFAULT NULL,
  PRIMARY KEY (`purchaseId`),
  FOREIGN KEY (`userId`) REFERENCE `user`(`userId`),
  FOREIGN KEY(`foodId`) REFERENCE `foodInventory`(`food`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
