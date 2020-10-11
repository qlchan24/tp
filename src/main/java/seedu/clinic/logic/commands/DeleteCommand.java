package seedu.clinic.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.clinic.commons.core.Messages;
import seedu.clinic.commons.core.index.Index;
import seedu.clinic.logic.commands.exceptions.CommandException;
import seedu.clinic.model.Model;
import seedu.clinic.model.supplier.Supplier;

/**
 * Deletes a supplier identified using it's displayed index from the CLI-nic app.
 */
public class DeleteCommand extends Command {

    public static final String COMMAND_WORD = "delete";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Deletes the supplier/warehouse identified by the index number used in the displayed lists.\n"
            + "Parameters: TYPE INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " supplier 1";

    public static final String MESSAGE_DELETE_SUPPLIER_SUCCESS = "Deleted Supplier: %1$s";

    private final Index targetIndex;

    public DeleteCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Supplier> lastShownList = model.getFilteredSupplierList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_SUPPLIER_DISPLAYED_INDEX);
        }

        Supplier supplierToDelete = lastShownList.get(targetIndex.getZeroBased());
        model.deleteSupplier(supplierToDelete);
        return new CommandResult(String.format(MESSAGE_DELETE_SUPPLIER_SUCCESS, supplierToDelete));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof DeleteCommand // instanceof handles nulls
                && targetIndex.equals(((DeleteCommand) other).targetIndex)); // state check
    }
}
