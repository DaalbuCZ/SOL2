.class Lq5/k$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/k;->V()Lt4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt4/h<",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lq5/k;


# direct methods
.method constructor <init>(Lq5/k;)V
    .locals 0

    iput-object p1, p0, Lq5/k$c;->a:Lq5/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lt4/i;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lq5/k$c;->b(Ljava/lang/Void;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Void;)Lt4/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Void;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object p1

    return-object p1
.end method
