.class Lh7/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/c;->c(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lh7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh7/i<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lh7/c;


# direct methods
.method constructor <init>(Lh7/c;)V
    .locals 0

    iput-object p1, p0, Lh7/c$d;->a:Lh7/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    new-instance v0, Lh7/h;

    invoke-direct {v0}, Lh7/h;-><init>()V

    return-object v0
.end method
