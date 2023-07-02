.class final enum Lc9/b$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc9/b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lc9/b$a;

.field public static final enum o:Lc9/b$a;

.field public static final enum p:Lc9/b$a;

.field private static final synthetic q:[Lc9/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lc9/b$a;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc9/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc9/b$a;->n:Lc9/b$a;

    new-instance v1, Lc9/b$a;

    const-string v3, "NO_ACTIVITY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc9/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc9/b$a;->o:Lc9/b$a;

    new-instance v3, Lc9/b$a;

    const-string v5, "ACTIVITY_NOT_FOUND"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lc9/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lc9/b$a;->p:Lc9/b$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lc9/b$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lc9/b$a;->q:[Lc9/b$a;

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

.method public static valueOf(Ljava/lang/String;)Lc9/b$a;
    .locals 1

    const-class v0, Lc9/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc9/b$a;

    return-object p0
.end method

.method public static values()[Lc9/b$a;
    .locals 1

    sget-object v0, Lc9/b$a;->q:[Lc9/b$a;

    invoke-virtual {v0}, [Lc9/b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc9/b$a;

    return-object v0
.end method
