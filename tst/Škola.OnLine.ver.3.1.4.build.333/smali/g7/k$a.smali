.class Lg7/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/protobuf/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/protobuf/b0<",
        "Ljava/lang/Integer;",
        "Lg7/l;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lg7/k$a;->b(Ljava/lang/Integer;)Lg7/l;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Integer;)Lg7/l;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lg7/l;->e(I)Lg7/l;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lg7/l;->o:Lg7/l;

    :cond_0
    return-object p1
.end method
