.class Ln7/n$f;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk7/w<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk7/w;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ls7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln7/n$f;->f(Ls7/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ls7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ln7/n$f;->g(Ls7/c;Ljava/lang/String;)V

    return-void
.end method

.method public f(Ls7/a;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Ls7/a;->Z()Ls7/b;

    move-result-object v0

    sget-object v1, Ls7/b;->v:Ls7/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ls7/a;->V()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v1, Ls7/b;->u:Ls7/b;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Ls7/a;->F()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ls7/a;->X()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(Ls7/c;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Ls7/c;->c0(Ljava/lang/String;)Ls7/c;

    return-void
.end method
