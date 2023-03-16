.class Lq5/i$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/i;->d(Lt4/i;)Lt4/i;
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
.field final synthetic a:Lq5/i;


# direct methods
.method constructor <init>(Lq5/i;)V
    .locals 0

    iput-object p1, p0, Lq5/i$d;->a:Lq5/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lt4/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lq5/i$d;->b(Lt4/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Lt4/i;)Ljava/lang/Void;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/i<",
            "TT;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
