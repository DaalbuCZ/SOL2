.class public final Lb2/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb2/o;


# instance fields
.field private final a:Lb2/o$a;


# direct methods
.method public constructor <init>(Lb2/o$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb2/o$a;

    iput-object p1, p0, Lb2/e0;->a:Lb2/o$a;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b(Lb2/w$a;)V
    .locals 0

    return-void
.end method

.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lx1/i;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public e(Lb2/w$a;)V
    .locals 0

    return-void
.end method

.method public f()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public h()Lb2/o$a;
    .locals 1

    iget-object v0, p0, Lb2/e0;->a:Lb2/o$a;

    return-object v0
.end method

.method public i()La2/b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
