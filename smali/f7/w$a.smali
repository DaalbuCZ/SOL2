.class Lf7/w$a;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf7/w;->b()Lf7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf7/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lf7/w;


# direct methods
.method constructor <init>(Lf7/w;)V
    .locals 0

    iput-object p1, p0, Lf7/w$a;->a:Lf7/w;

    invoke-direct {p0}, Lf7/w;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ln7/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ln7/a;->Z()Ln7/b;

    move-result-object v0

    sget-object v1, Ln7/b;->v:Ln7/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ln7/a;->S()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lf7/w$a;->a:Lf7/w;

    invoke-virtual {v0, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ln7/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/c;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ln7/c;->D()Ln7/c;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lf7/w$a;->a:Lf7/w;

    invoke-virtual {v0, p1, p2}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
