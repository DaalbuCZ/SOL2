.class Lq5/j0$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/j0$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt4/a<",
        "TT;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lq5/j0$a;


# direct methods
.method constructor <init>(Lq5/j0$a;)V
    .locals 0

    iput-object p1, p0, Lq5/j0$a$a;->a:Lq5/j0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lt4/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lq5/j0$a$a;->b(Lt4/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Lt4/i;)Ljava/lang/Void;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/i<",
            "TT;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-virtual {p1}, Lt4/i;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq5/j0$a$a;->a:Lq5/j0$a;

    iget-object v0, v0, Lq5/j0$a;->o:Lt4/j;

    invoke-virtual {p1}, Lt4/i;->l()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt4/j;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq5/j0$a$a;->a:Lq5/j0$a;

    iget-object v0, v0, Lq5/j0$a;->o:Lt4/j;

    invoke-virtual {p1}, Lt4/i;->k()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
