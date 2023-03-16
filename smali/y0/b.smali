.class public final enum Ly0/b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly0/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ly0/b;

.field public static final enum o:Ly0/b;

.field public static final enum p:Ly0/b;

.field public static final enum q:Ly0/b;

.field public static final enum r:Ly0/b;

.field public static final enum s:Ly0/b;

.field private static final synthetic t:[Ly0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Ly0/b;

    const-string v1, "Trace"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly0/b;->n:Ly0/b;

    new-instance v1, Ly0/b;

    const-string v3, "Debug"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ly0/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ly0/b;->o:Ly0/b;

    new-instance v3, Ly0/b;

    const-string v5, "Info"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ly0/b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ly0/b;->p:Ly0/b;

    new-instance v5, Ly0/b;

    const-string v7, "Warning"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ly0/b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ly0/b;->q:Ly0/b;

    new-instance v7, Ly0/b;

    const-string v9, "Error"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ly0/b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ly0/b;->r:Ly0/b;

    new-instance v9, Ly0/b;

    const-string v11, "Fatal"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Ly0/b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Ly0/b;->s:Ly0/b;

    const/4 v11, 0x6

    new-array v11, v11, [Ly0/b;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Ly0/b;->t:[Ly0/b;

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

.method public static valueOf(Ljava/lang/String;)Ly0/b;
    .locals 1

    const-class v0, Ly0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly0/b;

    return-object p0
.end method

.method public static values()[Ly0/b;
    .locals 1

    sget-object v0, Ly0/b;->t:[Ly0/b;

    invoke-virtual {v0}, [Ly0/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly0/b;

    return-object v0
.end method
