.class final Lj$/time/format/v;
.super Ljava/lang/Object;


# instance fields
.field private a:Lj$/time/temporal/TemporalAccessor;

.field private b:Lj$/time/format/DateTimeFormatter;

.field private c:I


# direct methods
.method constructor <init>(Lj$/time/temporal/TemporalAccessor;Lj$/time/format/DateTimeFormatter;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    invoke-virtual {p2}, Lj$/time/format/DateTimeFormatter;->a()Lj$/time/chrono/f;

    move-result-object v0

    invoke-virtual {p2}, Lj$/time/format/DateTimeFormatter;->d()Lj$/time/ZoneId;

    move-result-object v1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    goto/16 :goto_8

    :cond_0
    sget-object v2, Lj$/time/temporal/q;->a:Lj$/time/temporal/q;

    invoke-interface {p1, v2}, Lj$/time/temporal/TemporalAccessor;->m(Lj$/time/temporal/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj$/time/chrono/f;

    sget-object v3, Lj$/time/temporal/p;->a:Lj$/time/temporal/p;

    invoke-interface {p1, v3}, Lj$/time/temporal/TemporalAccessor;->m(Lj$/time/temporal/w;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj$/time/ZoneId;

    invoke-static {v0, v2}, Lj$/util/a;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    move-object v0, v5

    :cond_1
    invoke-static {v1, v3}, Lj$/util/a;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v1, v5

    :cond_2
    if-nez v0, :cond_3

    if-nez v1, :cond_3

    goto/16 :goto_8

    :cond_3
    if-eqz v0, :cond_4

    move-object v4, v0

    goto :goto_0

    :cond_4
    move-object v4, v2

    :goto_0
    if-eqz v1, :cond_a

    sget-object v6, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    invoke-interface {p1, v6}, Lj$/time/temporal/TemporalAccessor;->h(Lj$/time/temporal/o;)Z

    move-result v7

    if-eqz v7, :cond_7

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    sget-object v0, Lj$/time/chrono/g;->a:Lj$/time/chrono/g;

    :goto_1
    sget-object v0, Lj$/time/Instant;->c:Lj$/time/Instant;

    .line 2
    instance-of v0, p1, Lj$/time/Instant;

    if-eqz v0, :cond_6

    check-cast p1, Lj$/time/Instant;

    goto :goto_2

    :cond_6
    :try_start_0
    invoke-interface {p1, v6}, Lj$/time/temporal/TemporalAccessor;->k(Lj$/time/temporal/o;)J

    move-result-wide v2

    sget-object v0, Lj$/time/temporal/a;->NANO_OF_SECOND:Lj$/time/temporal/a;

    invoke-interface {p1, v0}, Lj$/time/temporal/TemporalAccessor;->g(Lj$/time/temporal/o;)I

    move-result v0

    int-to-long v4, v0

    invoke-static {v2, v3, v4, v5}, Lj$/time/Instant;->u(JJ)Lj$/time/Instant;

    move-result-object p1
    :try_end_0
    .catch Lj$/time/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :goto_2
    invoke-static {p1, v1}, Lj$/time/ZonedDateTime;->q(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p1

    goto/16 :goto_8

    :catch_0
    move-exception p2

    .line 4
    new-instance v0, Lj$/time/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to obtain Instant from TemporalAccessor: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lj$/time/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 5
    :cond_7
    :try_start_1
    invoke-virtual {v1}, Lj$/time/ZoneId;->p()Lj$/time/zone/c;

    move-result-object v6

    invoke-virtual {v6}, Lj$/time/zone/c;->h()Z

    move-result v7

    if-eqz v7, :cond_8

    sget-object v7, Lj$/time/Instant;->c:Lj$/time/Instant;

    invoke-virtual {v6, v7}, Lj$/time/zone/c;->d(Lj$/time/Instant;)Lj$/time/ZoneOffset;

    move-result-object v6
    :try_end_1
    .catch Lj$/time/zone/d; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    :cond_8
    move-object v6, v1

    .line 6
    :goto_3
    instance-of v6, v6, Lj$/time/ZoneOffset;

    if-eqz v6, :cond_a

    sget-object v6, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    invoke-interface {p1, v6}, Lj$/time/temporal/TemporalAccessor;->h(Lj$/time/temporal/o;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {p1, v6}, Lj$/time/temporal/TemporalAccessor;->g(Lj$/time/temporal/o;)I

    move-result v6

    invoke-virtual {v1}, Lj$/time/ZoneId;->p()Lj$/time/zone/c;

    move-result-object v7

    sget-object v8, Lj$/time/Instant;->c:Lj$/time/Instant;

    invoke-virtual {v7, v8}, Lj$/time/zone/c;->d(Lj$/time/Instant;)Lj$/time/ZoneOffset;

    move-result-object v7

    invoke-virtual {v7}, Lj$/time/ZoneOffset;->s()I

    move-result v7

    if-ne v6, v7, :cond_9

    goto :goto_4

    :cond_9
    new-instance p2, Lj$/time/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to apply override zone \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' because the temporal object being formatted has a different offset but does not represent an instant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lj$/time/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_a
    :goto_4
    if-eqz v1, :cond_b

    move-object v3, v1

    :cond_b
    if-eqz v0, :cond_10

    sget-object v1, Lj$/time/temporal/a;->EPOCH_DAY:Lj$/time/temporal/a;

    invoke-interface {p1, v1}, Lj$/time/temporal/TemporalAccessor;->h(Lj$/time/temporal/o;)Z

    move-result v1

    if-eqz v1, :cond_c

    move-object v0, v4

    check-cast v0, Lj$/time/chrono/g;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-static {p1}, Lj$/time/h;->q(Lj$/time/temporal/TemporalAccessor;)Lj$/time/h;

    move-result-object v5

    goto :goto_7

    .line 8
    :cond_c
    sget-object v1, Lj$/time/chrono/g;->a:Lj$/time/chrono/g;

    if-ne v0, v1, :cond_d

    if-eqz v2, :cond_10

    :cond_d
    invoke-static {}, Lj$/time/temporal/a;->values()[Lj$/time/temporal/a;

    move-result-object v1

    array-length v2, v1

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v2, :cond_10

    aget-object v7, v1, v6

    invoke-virtual {v7}, Lj$/time/temporal/a;->l()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {p1, v7}, Lj$/time/temporal/TemporalAccessor;->h(Lj$/time/temporal/o;)Z

    move-result v7

    if-nez v7, :cond_e

    goto :goto_6

    :cond_e
    new-instance p2, Lj$/time/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to apply override chronology \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\' because the temporal object being formatted contains date fields but does not represent a whole date: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lj$/time/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_f
    :goto_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_10
    :goto_7
    new-instance v0, Lj$/time/format/u;

    invoke-direct {v0, v5, p1, v4, v3}, Lj$/time/format/u;-><init>(Lj$/time/chrono/b;Lj$/time/temporal/TemporalAccessor;Lj$/time/chrono/f;Lj$/time/ZoneId;)V

    move-object p1, v0

    .line 9
    :goto_8
    iput-object p1, p0, Lj$/time/format/v;->a:Lj$/time/temporal/TemporalAccessor;

    iput-object p2, p0, Lj$/time/format/v;->b:Lj$/time/format/DateTimeFormatter;

    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    iget v0, p0, Lj$/time/format/v;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lj$/time/format/v;->c:I

    return-void
.end method

.method b()Lj$/time/format/x;
    .locals 1

    iget-object v0, p0, Lj$/time/format/v;->b:Lj$/time/format/DateTimeFormatter;

    invoke-virtual {v0}, Lj$/time/format/DateTimeFormatter;->b()Lj$/time/format/x;

    move-result-object v0

    return-object v0
.end method

.method c()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lj$/time/format/v;->b:Lj$/time/format/DateTimeFormatter;

    invoke-virtual {v0}, Lj$/time/format/DateTimeFormatter;->c()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method d()Lj$/time/temporal/TemporalAccessor;
    .locals 1

    iget-object v0, p0, Lj$/time/format/v;->a:Lj$/time/temporal/TemporalAccessor;

    return-object v0
.end method

.method e(Lj$/time/temporal/o;)Ljava/lang/Long;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lj$/time/format/v;->a:Lj$/time/temporal/TemporalAccessor;

    invoke-interface {v0, p1}, Lj$/time/temporal/TemporalAccessor;->k(Lj$/time/temporal/o;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Lj$/time/d; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget v0, p0, Lj$/time/format/v;->c:I

    if-lez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    throw p1
.end method

.method f(Lj$/time/temporal/w;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj$/time/format/v;->a:Lj$/time/temporal/TemporalAccessor;

    invoke-interface {v0, p1}, Lj$/time/temporal/TemporalAccessor;->m(Lj$/time/temporal/w;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    iget v0, p0, Lj$/time/format/v;->c:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lj$/time/d;

    const-string v0, "Unable to extract value: "

    invoke-static {v0}, Lj$/time/a;->b(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lj$/time/format/v;->a:Lj$/time/temporal/TemporalAccessor;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lj$/time/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method g()V
    .locals 1

    iget v0, p0, Lj$/time/format/v;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lj$/time/format/v;->c:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj$/time/format/v;->a:Lj$/time/temporal/TemporalAccessor;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
