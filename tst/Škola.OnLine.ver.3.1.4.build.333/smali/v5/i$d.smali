.class Lv5/i$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv5/i;->d(Ly4/i;)Ly4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly4/a<",
        "TT;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lv5/i;


# direct methods
.method constructor <init>(Lv5/i;)V
    .locals 0

    iput-object p1, p0, Lv5/i$d;->a:Lv5/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ly4/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lv5/i$d;->b(Ly4/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Ly4/i;)Ljava/lang/Void;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/i<",
            "TT;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
