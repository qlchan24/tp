package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_ADDRESS_A;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_ADDRESS_B;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_NAME_A;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_NAME_B;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_PHONE_A;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_PHONE_B;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_PRODUCT_NAME_A;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_PRODUCT_NAME_B;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_PRODUCT_QUANTITY_A;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_PRODUCT_QUANTITY_B;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_REMARK_A;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WAREHOUSE_REMARK_B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import seedu.address.model.AddressBook;
import seedu.address.model.warehouse.Warehouse;

/**
 * A utility class containing a list of {@code Supplier} objects to be used in tests.
 */
public class TypicalWarehouse {

    public static final Warehouse ALICE = new WarehouseBuilder().withName("Warehouse Alice")
            .withRemark("Warehouse 1").withAddress("alice@example.com")
            .withPhone("94351253")
            .withProducts(Map.of("Panadol", 100)).build();
    public static final Warehouse BENSON = new WarehouseBuilder().withName("Warehouse Benson")
            .withRemark("Warehouse 2").withAddress("benson@example.com")
            .withPhone("94351453")
            .withProducts(Map.of("Panadol", 200)).build();
    public static final Warehouse CARL = new WarehouseBuilder().withName("Warehouse Carl")
            .withRemark("Warehouse 3").withAddress("carl@example.com")
            .withPhone("94361253").build();
    public static final Warehouse DANIEL = new WarehouseBuilder().withName("Warehouse Daniel")
            .withRemark("Warehouse 4").withAddress("daniel@example.com")
            .withPhone("94351233")
            .withProducts(Map.of("Panadol", 1)).build();
    public static final Warehouse ELLE = new WarehouseBuilder().withName("Warehouse Elle")
            .withRemark("Warehouse 5").withAddress("elle@example.com")
            .withPhone("94651253").build();
    public static final Warehouse FIONA = new WarehouseBuilder().withName("Warehouse Fiona")
            .withRemark("Warehouse 10").withAddress("fiona@example.com")
            .withPhone("92351253")
            .withProducts(Map.of("Panadol", 1000)).build();
    public static final Warehouse GEORGE = new WarehouseBuilder().withName("Warehouse George")
            .withRemark("Warehouse to be removed").withAddress("george@example.com")
            .withPhone("84351253")
            .withProducts(Map.of("Panadol", 50)).build();

    // Manually added
    public static final Warehouse HOON = new WarehouseBuilder().withName("Warehouse Hoon").withPhone("8482424")
            .withAddress("some address").withRemark("small warehouse").build();
    public static final Warehouse IDA = new WarehouseBuilder().withName("Ida prprpr").withPhone("8482131")
            .withAddress("hans@35 prince george.").withRemark("big warehouse").build();

    // Manually added - Supplier's details found in {@code CommandTestUtil}
    public static final Warehouse A = new WarehouseBuilder().withName(VALID_WAREHOUSE_NAME_A)
            .withPhone(VALID_WAREHOUSE_PHONE_A)
            .withAddress(VALID_WAREHOUSE_ADDRESS_A)
            .withRemark(VALID_WAREHOUSE_REMARK_A)
            .withProducts(Map.of(VALID_WAREHOUSE_PRODUCT_NAME_A, VALID_WAREHOUSE_PRODUCT_QUANTITY_A))
            .build();
    public static final Warehouse B = new WarehouseBuilder().withName(VALID_WAREHOUSE_NAME_B)
            .withPhone(VALID_WAREHOUSE_PHONE_B)
            .withAddress(VALID_WAREHOUSE_ADDRESS_B)
            .withRemark(VALID_WAREHOUSE_REMARK_B)
            .withProducts(Map.of(VALID_WAREHOUSE_PRODUCT_NAME_B, VALID_WAREHOUSE_PRODUCT_QUANTITY_B))
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalWarehouse() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical suppliers.
     */
    public static AddressBook getTypicalWarehouseOnlyAddressBook() {
        AddressBook ab = new AddressBook();
        for (Warehouse warehouse : getTypicalWarehouses()) {
            ab.addWarehouse(warehouse);
        }
        return ab;
    }

    public static List<Warehouse> getTypicalWarehouses() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
