.class final enum Lu8/b$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lu8/b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lu8/b$a;

.field public static final enum o:Lu8/b$a;

.field public static final enum p:Lu8/b$a;

.field private static final synthetic q:[Lu8/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lu8/b$a;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu8/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu8/b$a;->n:Lu8/b$a;

    new-instance v1, Lu8/b$a;

    const-string v3, "NO_ACTIVITY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lu8/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lu8/b$a;->o:Lu8/b$a;

    new-instance v3, Lu8/b$a;

    const-string v5, "ACTIVITY_NOT_FOUND"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lu8/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lu8/b$a;->p:Lu8/b$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lu8/b$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lu8/b$a;->q:[Lu8/b$a;

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

.method public static valueOf(Ljava/lang/String;)Lu8/b$a;
    .locals 1

    const-class v0, Lu8/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu8/b$a;

    return-object p0
.end method

.method public static values()[Lu8/b$a;
    .locals 1

    sget-object v0, Lu8/b$a;->q:[Lu8/b$a;

    invoke-virtual {v0}, [Lu8/b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu8/b$a;

    return-object v0
.end method
