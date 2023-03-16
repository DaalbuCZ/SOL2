.class final Lr9/m1;
.super Lr9/i;
.source ""


# instance fields
.field private final n:Lj9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/l<",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj9/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lr9/i;-><init>()V

    iput-object p1, p0, Lr9/m1;->n:Lj9/l;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lr9/m1;->n:Lj9/l;

    invoke-interface {v0, p1}, Lj9/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lr9/m1;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ly8/s;->a:Ly8/s;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InvokeOnCancel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr9/m1;->n:Lj9/l;

    invoke-static {v1}, Lr9/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lr9/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
