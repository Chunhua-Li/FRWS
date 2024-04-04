/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  lchca
 * Created: Mar 17, 2024
 */

CREATE TABLE `subscriber` (
  `subscriberId` int NOT NULL AUTO_INCREMENT,
  `subscriberName` varchar(50) DEFAULT NULL,
  `subscriberContactInfo` varchar(50) DEFAULT NULL,
  `subscriberLocation` varchar(50) DEFAULT NULL,
  `subscriberFoodCategories` varchar(50) DEFAULT NULL,  
  PRIMARY KEY (`subscriberId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
