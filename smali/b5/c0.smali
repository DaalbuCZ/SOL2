.class public final Lb5/c0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb5/c0$a;
    }
.end annotation


# direct methods
.method static a(Lb5/z;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb5/z<",
            "**>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of v0, p1, Lb5/z;

    if-eqz v0, :cond_1

    check-cast p1, Lb5/z;

    invoke-interface {p0}, Lb5/z;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1}, Lb5/z;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Ljava/util/Map;La5/o;)Lb5/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;",
            "La5/o<",
            "+",
            "Ljava/util/List<",
            "TV;>;>;)",
            "Lb5/v<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lb5/c0$a;

    invoke-direct {v0, p0, p1}, Lb5/c0$a;-><init>(Ljava/util/Map;La5/o;)V

    return-object v0
.end method
