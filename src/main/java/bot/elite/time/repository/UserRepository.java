package bot.elite.time.repository;

import bot.elite.Tables;
import bot.elite.time.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserRepository {
    private final DSLContext dsl;

    public List<bot.elite.tables.pojos.User> getUsers() {
        return dsl.selectFrom(Tables.USER)
                .fetchInto(bot.elite.tables.pojos.User.class);
    }

    public Integer insert(UserModel userModel) {
        bot.elite.tables.records.UserRecord userRecord = dsl
                .insertInto(Tables.USER, Tables.USER.GMT, Tables.USER.TG_ID)
                .values(userModel.getGmt(), userModel.getTgId())
                .returning(Tables.USER.ID)
                .fetchOne();
        return userRecord.getValue(Tables.USER.ID);
    }
}
