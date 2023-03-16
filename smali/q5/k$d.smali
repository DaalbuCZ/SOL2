.class Lq5/k$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/k;->U(Lt4/i;)Lt4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt4/h<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lt4/i;

.field final synthetic b:Lq5/k;


# direct methods
.method constructor <init>(Lq5/k;Lt4/i;)V
    .locals 0

    iput-object p1, p0, Lq5/k$d;->b:Lq5/k;

    iput-object p2, p0, Lq5/k$d;->a:Lt4/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lt4/i;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lq5/k$d;->b(Ljava/lang/Boolean;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Boolean;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq5/k$d;->b:Lq5/k;

    invoke-static {v0}, Lq5/k;->m(Lq5/k;)Lq5/i;

    move-result-object v0

    new-instance v1, Lq5/k$d$a;

    invoke-direct {v1, p0, p1}, Lq5/k$d$a;-><init>(Lq5/k$d;Ljava/lang/Boolean;)V

    invoke-virtual {v0, v1}, Lq5/i;->i(Ljava/util/concurrent/Callable;)Lt4/i;

    move-result-object p1

    return-object p1
.end method
