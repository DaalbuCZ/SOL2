.class Lm7/c$n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm7/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm7/c;->c(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lm7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm7/i<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lm7/c;


# direct methods
.method constructor <init>(Lm7/c;)V
    .locals 0

    iput-object p1, p0, Lm7/c$n;->a:Lm7/c;

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

    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    return-object v0
.end method
