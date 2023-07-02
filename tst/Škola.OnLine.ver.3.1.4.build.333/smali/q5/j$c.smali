.class final enum Lq5/j$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq5/j$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lq5/j$c;

.field public static final enum o:Lq5/j$c;

.field public static final enum p:Lq5/j$c;

.field public static final enum q:Lq5/j$c;

.field private static final synthetic r:[Lq5/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lq5/j$c;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq5/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq5/j$c;->n:Lq5/j$c;

    new-instance v1, Lq5/j$c;

    const-string v3, "QUEUING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lq5/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lq5/j$c;->o:Lq5/j$c;

    new-instance v3, Lq5/j$c;

    const-string v5, "QUEUED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lq5/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lq5/j$c;->p:Lq5/j$c;

    new-instance v5, Lq5/j$c;

    const-string v7, "RUNNING"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lq5/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lq5/j$c;->q:Lq5/j$c;

    const/4 v7, 0x4

    new-array v7, v7, [Lq5/j$c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lq5/j$c;->r:[Lq5/j$c;

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

.method public static valueOf(Ljava/lang/String;)Lq5/j$c;
    .locals 1

    const-class v0, Lq5/j$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq5/j$c;

    return-object p0
.end method

.method public static values()[Lq5/j$c;
    .locals 1

    sget-object v0, Lq5/j$c;->r:[Lq5/j$c;

    invoke-virtual {v0}, [Lq5/j$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq5/j$c;

    return-object v0
.end method
