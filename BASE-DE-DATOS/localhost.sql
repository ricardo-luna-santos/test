SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `test`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `INVENTORY`
--

CREATE TABLE `INVENTORY` (
  `id` int NOT NULL,
  `Ventas` int DEFAULT NULL,
  `id_products` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `INVENTORY`
--

INSERT INTO `INVENTORY` (`id`, `Ventas`, `id_products`) VALUES
(19, 50, 12),
(20, 3, 13),
(21, 85, 14),
(22, 50, 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `LEGEND`
--

CREATE TABLE `LEGEND` (
  `id` int NOT NULL,
  `Meaning` varchar(45) DEFAULT NULL,
  `Colors` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `LEGEND`
--

INSERT INTO `LEGEND` (`id`, `Meaning`, `Colors`) VALUES
(1, 'Not enough product', 'Red'),
(2, 'More than necessary', 'Yellow'),
(3, 'Full capacity', 'Green');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `PRODUCTS`
--

CREATE TABLE `PRODUCTS` (
  `id` int NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Total_Qty` int DEFAULT '0',
  `Remaning_Qty` int DEFAULT '0',
  `Warehouse` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `PRODUCTS`
--

INSERT INTO `PRODUCTS` (`id`, `Name`, `Total_Qty`, `Remaning_Qty`, `Warehouse`) VALUES
(12, 'Coke', 100, 50, 'Plant 1'),
(13, 'Sprite', 45, 3, 'Plant 2'),
(14, 'Dr. Pepper', 90, 85, 'Plant 3'),
(15, 'Canada Dry', 95, 50, 'Plant 2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSES`
--

CREATE TABLE `WAREHOUSES` (
  `Name` varchar(45) NOT NULL,
  `MinProduct` int DEFAULT NULL,
  `MaxProduct` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `WAREHOUSES`
--

INSERT INTO `WAREHOUSES` (`Name`, `MinProduct`, `MaxProduct`) VALUES
('Plant 1', 10, 100),
('Plant 2', 5, 50),
('Plant 3', 7, 75),
('Plant 4', 10, 100),
('Plant 5', 20, 250);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `INVENTORY`
--
ALTER TABLE `INVENTORY`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_INVENTORY_1_idx` (`id_products`);

--
-- Indices de la tabla `LEGEND`
--
ALTER TABLE `LEGEND`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `PRODUCTS`
--
ALTER TABLE `PRODUCTS`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_PRODUCTS_1_idx` (`Warehouse`);

--
-- Indices de la tabla `WAREHOUSES`
--
ALTER TABLE `WAREHOUSES`
  ADD PRIMARY KEY (`Name`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `INVENTORY`
--
ALTER TABLE `INVENTORY`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `LEGEND`
--
ALTER TABLE `LEGEND`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `PRODUCTS`
--
ALTER TABLE `PRODUCTS`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `INVENTORY`
--
ALTER TABLE `INVENTORY`
  ADD CONSTRAINT `fk_INVENTORY_1` FOREIGN KEY (`id_products`) REFERENCES `PRODUCTS` (`id`);

--
-- Filtros para la tabla `PRODUCTS`
--
ALTER TABLE `PRODUCTS`
  ADD CONSTRAINT `fk_PRODUCTS_1` FOREIGN KEY (`Warehouse`) REFERENCES `WAREHOUSES` (`Name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
