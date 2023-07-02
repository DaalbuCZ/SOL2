.class final enum Lq5/i$a;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq5/i$a;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum n:Lq5/i$a;

.field private static final synthetic o:[Lq5/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq5/i$a;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq5/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq5/i$a;->n:Lq5/i$a;

    const/4 v1, 0x1

    new-array v1, v1, [Lq5/i$a;

    aput-object v0, v1, v2

    sput-object v1, Lq5/i$a;->o:[Lq5/i$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lq5/i$a;
    .locals 1

    const-class v0, Lq5/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq5/i$a;

    return-object p0
.end method

.method public static values()[Lq5/i$a;
    .locals 1

    sget-object v0, Lq5/i$a;->o:[Lq5/i$a;

    invoke-virtual {v0}, [Lq5/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq5/i$a;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
