package bot.elite.time.model;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
public class UserModel {
    private final Integer tgId;
    private final String gmt;
}
