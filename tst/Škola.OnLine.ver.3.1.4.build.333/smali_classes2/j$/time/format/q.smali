.class Lj$/time/format/q;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/time/format/g;


# static fields
.field private static volatile a:Ljava/util/Map$Entry;

.field private static volatile b:Ljava/util/Map$Entry;


# direct methods
.method constructor <init>(Lj$/time/temporal/w;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Lj$/time/format/s;Ljava/lang/CharSequence;IILj$/time/format/k;)I
    .locals 3

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt p4, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2, p4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-eq v1, v2, :cond_4

    invoke-interface {p2, p4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x5a

    invoke-virtual {p1, v1, v2}, Lj$/time/format/s;->a(CC)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lj$/time/format/s;->c()Lj$/time/format/s;

    move-result-object v1

    invoke-virtual {p5, v1, p2, p4}, Lj$/time/format/k;->b(Lj$/time/format/s;Ljava/lang/CharSequence;I)I

    move-result p2

    if-gez p2, :cond_3

    :try_start_0
    sget-object p2, Lj$/time/format/k;->d:Lj$/time/format/k;

    if-ne p5, p2, :cond_2

    not-int p1, p3

    return p1

    :cond_2
    invoke-static {v0}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj$/time/format/s;->m(Lj$/time/ZoneId;)V

    return p4

    :cond_3
    sget-object p4, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    invoke-virtual {v1, p4}, Lj$/time/format/s;->i(Lj$/time/temporal/o;)Ljava/lang/Long;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide p4

    long-to-int p4, p4

    invoke-static {p4}, Lj$/time/ZoneOffset;->v(I)Lj$/time/ZoneOffset;

    move-result-object p4

    invoke-static {v0, p4}, Lj$/time/ZoneId;->q(Ljava/lang/String;Lj$/time/ZoneOffset;)Lj$/time/ZoneId;

    move-result-object p4

    invoke-virtual {p1, p4}, Lj$/time/format/s;->m(Lj$/time/ZoneId;)V
    :try_end_0
    .catch Lj$/time/d; {:try_start_0 .. :try_end_0} :catch_0

    return p2

    :catch_0
    not-int p1, p3

    return p1

    :cond_4
    :goto_0
    invoke-static {v0}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj$/time/format/s;->m(Lj$/time/ZoneId;)V

    return p4
.end method


# virtual methods
.method public a(Lj$/time/format/v;Ljava/lang/StringBuilder;)Z
    .locals 1

    sget-object v0, Lj$/time/format/a;->a:Lj$/time/format/a;

    invoke-virtual {p1, v0}, Lj$/time/format/v;->f(Lj$/time/temporal/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/time/ZoneId;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lj$/time/ZoneId;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    return p1
.end method

.method public b(Lj$/time/format/s;Ljava/lang/CharSequence;I)I
    .locals 9

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-gt p3, v1, :cond_f

    if-ne p3, v1, :cond_0

    not-int v0, p3

    return v0

    :cond_0
    invoke-interface {p2, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v4, 0x2b

    if-eq v2, v4, :cond_e

    const/16 v4, 0x2d

    if-ne v2, v4, :cond_1

    goto/16 :goto_3

    :cond_1
    add-int/lit8 v6, p3, 0x2

    if-lt v1, v6, :cond_4

    add-int/lit8 v4, p3, 0x1

    invoke-interface {p2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v7, 0x55

    invoke-virtual {p1, v2, v7}, Lj$/time/format/s;->a(CC)Z

    move-result v7

    const/16 v8, 0x54

    if-eqz v7, :cond_3

    invoke-virtual {p1, v4, v8}, Lj$/time/format/s;->a(CC)Z

    move-result v7

    if-eqz v7, :cond_3

    add-int/lit8 v7, p3, 0x3

    if-lt v1, v7, :cond_2

    invoke-interface {p2, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x43

    invoke-virtual {p1, v1, v2}, Lj$/time/format/s;->a(CC)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v6, Lj$/time/format/k;->e:Lj$/time/format/k;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, v7

    invoke-direct/range {v1 .. v6}, Lj$/time/format/q;->c(Lj$/time/format/s;Ljava/lang/CharSequence;IILj$/time/format/k;)I

    move-result v0

    return v0

    :cond_2
    sget-object v7, Lj$/time/format/k;->e:Lj$/time/format/k;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, v6

    move-object v6, v7

    invoke-direct/range {v1 .. v6}, Lj$/time/format/q;->c(Lj$/time/format/s;Ljava/lang/CharSequence;IILj$/time/format/k;)I

    move-result v0

    return v0

    :cond_3
    const/16 v7, 0x47

    invoke-virtual {p1, v2, v7}, Lj$/time/format/s;->a(CC)Z

    move-result v7

    if-eqz v7, :cond_4

    add-int/lit8 v7, p3, 0x3

    if-lt v1, v7, :cond_4

    const/16 v1, 0x4d

    invoke-virtual {p1, v4, v1}, Lj$/time/format/s;->a(CC)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {p1, v1, v8}, Lj$/time/format/s;->a(CC)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v6, Lj$/time/format/k;->e:Lj$/time/format/k;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, v7

    invoke-direct/range {v1 .. v6}, Lj$/time/format/q;->c(Lj$/time/format/s;Ljava/lang/CharSequence;IILj$/time/format/k;)I

    move-result v0

    return v0

    .line 1
    :cond_4
    invoke-static {}, Lj$/time/zone/g;->a()Ljava/util/Set;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v4

    invoke-virtual {p1}, Lj$/time/format/s;->j()Z

    move-result v6

    if-eqz v6, :cond_5

    sget-object v6, Lj$/time/format/q;->a:Ljava/util/Map$Entry;

    goto :goto_0

    :cond_5
    sget-object v6, Lj$/time/format/q;->b:Ljava/util/Map$Entry;

    :goto_0
    if-eqz v6, :cond_6

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eq v7, v4, :cond_b

    :cond_6
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lj$/time/format/s;->j()Z

    move-result v6

    if-eqz v6, :cond_7

    sget-object v6, Lj$/time/format/q;->a:Ljava/util/Map$Entry;

    goto :goto_1

    :cond_7
    sget-object v6, Lj$/time/format/q;->b:Ljava/util/Map$Entry;

    :goto_1
    if-eqz v6, :cond_8

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eq v7, v4, :cond_a

    :cond_8
    new-instance v6, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, p1}, Lj$/time/format/m;->e(Ljava/util/Set;Lj$/time/format/s;)Lj$/time/format/m;

    move-result-object v1

    invoke-direct {v6, v4, v1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj$/time/format/s;->j()Z

    move-result v1

    if-eqz v1, :cond_9

    sput-object v6, Lj$/time/format/q;->a:Ljava/util/Map$Entry;

    goto :goto_2

    :cond_9
    sput-object v6, Lj$/time/format/q;->b:Ljava/util/Map$Entry;

    :cond_a
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_b
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj$/time/format/m;

    .line 2
    new-instance v4, Ljava/text/ParsePosition;

    invoke-direct {v4, p3}, Ljava/text/ParsePosition;-><init>(I)V

    invoke-virtual {v1, p2, v4}, Lj$/time/format/m;->c(Ljava/lang/CharSequence;Ljava/text/ParsePosition;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_d

    const/16 v1, 0x5a

    invoke-virtual {p1, v2, v1}, Lj$/time/format/s;->a(CC)Z

    move-result v1

    if-eqz v1, :cond_c

    sget-object v1, Lj$/time/ZoneOffset;->UTC:Lj$/time/ZoneOffset;

    invoke-virtual {p1, v1}, Lj$/time/format/s;->m(Lj$/time/ZoneId;)V

    add-int/lit8 v0, p3, 0x1

    return v0

    :cond_c
    not-int v0, p3

    return v0

    :cond_d
    invoke-static {v1}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object v1

    invoke-virtual {p1, v1}, Lj$/time/format/s;->m(Lj$/time/ZoneId;)V

    invoke-virtual {v4}, Ljava/text/ParsePosition;->getIndex()I

    move-result v0

    return v0

    :catchall_0
    move-exception v0

    .line 3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 4
    :cond_e
    :goto_3
    sget-object v6, Lj$/time/format/k;->d:Lj$/time/format/k;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p3

    invoke-direct/range {v1 .. v6}, Lj$/time/format/q;->c(Lj$/time/format/s;Ljava/lang/CharSequence;IILj$/time/format/k;)I

    move-result v0

    return v0

    :cond_f
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ZoneRegionId()"

    return-object v0
.end method
