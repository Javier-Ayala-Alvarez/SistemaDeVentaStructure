CREATE TABLE `bono`  (
  `idBono` int NOT NULL AUTO_INCREMENT,
  `bono` double NOT NULL,
  `cargoEmpleado` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idBono`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `cliente`  (
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `codigoCliente` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nombre` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `apellido` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `telefonoCliente` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `direccionCliente` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`idCliente`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `empleado`  (
  `idEmpleado` int NOT NULL AUTO_INCREMENT,
  `codigoEmpleado` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nombre` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `apellido` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `telefonoEmpleado` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dirrecionEmpleado` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `salarioEmpleado` double NOT NULL,
  `cargoEmpleado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `afp` double NOT NULL,
  `isss` double NOT NULL,
  `contratacion` date NOT NULL,
  `estado` int NOT NULL,
  `idEmpresa` int NOT NULL,
  `idUsuario` int NULL DEFAULT NULL,
  `idBono` int NULL DEFAULT NULL,
  PRIMARY KEY (`idEmpleado`) USING BTREE,
  INDEX `fk_empleado_empresa1`(`idEmpresa`) USING BTREE,
  INDEX `fk_empleado_idUsuario`(`idUsuario`) USING BTREE,
  INDEX `fk_empleado_idBono`(`idBono`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `empresa`  (
  `idEmpresa` int NOT NULL AUTO_INCREMENT,
  `codigoEmpresa` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nombreEmpresa` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dirrecionEmpresa` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `correoEmpresa` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`idEmpresa`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `gastoempresa`  (
  `idGastos` int NOT NULL AUTO_INCREMENT,
  `codigoGasto` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fecha` date NOT NULL,
  `tipo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `saldo` double NOT NULL,
  `idEmpresa` int NULL DEFAULT NULL,
  `idEmpleado` int NULL DEFAULT NULL,
  PRIMARY KEY (`idGastos`) USING BTREE,
  INDEX `fk_empleado`(`idEmpleado`) USING BTREE,
  INDEX `fk_gastoEmpresa_empresa1`(`idEmpresa`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `iniciocaja`  (
  `idCaja` int NOT NULL AUTO_INCREMENT,
  `codigoCaja` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaCierre` date NOT NULL,
  `dineroCajaInicio` double(9, 2) NOT NULL,
  `dineroCajaCierre` double(9, 2) NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idCaja`) USING BTREE,
  INDEX `fk_inicioCaja_usuario1`(`idUsuario`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 227 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `producto`  (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `codigoProducto` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nombreProducto` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `precioCompra` double(6, 2) NOT NULL,
  `cantidad` int NOT NULL,
  `max` int NOT NULL,
  `min` int NOT NULL,
  `estado` int NOT NULL,
  `gananciaUni` double(6, 2) NOT NULL,
  `iva` double(5, 2) NOT NULL,
  `precioVenta` double(6, 2) NOT NULL,
  `idEmpresa` int NOT NULL,
  PRIMARY KEY (`idProducto`) USING BTREE,
  INDEX `fk_producto_empresa1`(`idEmpresa`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `registros`  (
  `idRegistros` int NOT NULL AUTO_INCREMENT,
  `cantidadProducto` int NOT NULL,
  `precioTotalProducto` double(10, 2) NOT NULL,
  `idVenta` int NOT NULL,
  `idProducto` int NOT NULL,
  PRIMARY KEY (`idRegistros`) USING BTREE,
  INDEX `fk_registros_producto1`(`idProducto`) USING BTREE,
  INDEX `fk_registros_venta1`(`idVenta`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 125 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `reporte`  (
  `idReporte` int NOT NULL AUTO_INCREMENT,
  `fechaCompra` date NOT NULL,
  `cantidad` int NOT NULL,
  `precioCompra` double(255, 2) NOT NULL,
  `estado` int NOT NULL,
  `idProducto` int NOT NULL,
  PRIMARY KEY (`idReporte`) USING BTREE,
  INDEX `id_producto`(`idProducto`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `usuario`  (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `contraseña` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`idUsuario`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `venta`  (
  `idVenta` int NOT NULL AUTO_INCREMENT,
  `nFactura` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fechaVenta` date NOT NULL,
  `precioTotal` double(6, 2) NOT NULL,
  `estado` int NOT NULL,
  `idCliente` int NOT NULL,
  `idCaja` int NOT NULL,
  `idEmpleado` int NOT NULL,
  `idEmpresa` int NOT NULL,
  PRIMARY KEY (`idVenta`) USING BTREE,
  INDEX `fk_venta_cliente1`(`idCliente`) USING BTREE,
  INDEX `fk_venta_empleado1`(`idEmpleado`) USING BTREE,
  INDEX `fk_venta_empresa`(`idEmpresa`) USING BTREE,
  INDEX `fk_venta_inicioCaja1`(`idCaja`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 88 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

ALTER TABLE `empleado` ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `empleado` ADD CONSTRAINT `empleado_ibfk_2` FOREIGN KEY (`idBono`) REFERENCES `bono` (`idBono`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `empleado` ADD CONSTRAINT `empleado_ibfk_3` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `gastoempresa` ADD CONSTRAINT `gastoempresa_ibfk_1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `gastoempresa` ADD CONSTRAINT `gastoempresa_ibfk_2` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `iniciocaja` ADD CONSTRAINT `iniciocaja_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `producto` ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `registros` ADD CONSTRAINT `registros_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `registros` ADD CONSTRAINT `registros_ibfk_2` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `reporte` ADD CONSTRAINT `id_producto` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `venta` ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `venta` ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `venta` ADD CONSTRAINT `venta_ibfk_3` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE `venta` ADD CONSTRAINT `venta_ibfk_4` FOREIGN KEY (`idCaja`) REFERENCES `iniciocaja` (`idCaja`) ON DELETE NO ACTION ON UPDATE NO ACTION;

