package si.um.feri.measurements;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import si.um.feri.measurements.dao.MeasurementRepository;
import si.um.feri.measurements.dto.Product;
import si.um.feri.measurements.rest.MeasurementController;
import si.um.feri.measurements.rest.MeasurementHistoryController;
import si.um.feri.measurements.rest.ProductController;

@QuarkusTest
public class RestScenarioTest {

    @Inject
    ProductController productController;

    @Inject
    MeasurementController measurementPostController;

    @Inject
    MeasurementHistoryController measurementHistoryController;

    @Inject
    MeasurementRepository measurementRepository;

    private Product newProduct;


}
