.class public final enum Ls8/k$d$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls8/k$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls8/k$d$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ls8/k$d$a;

.field public static final enum o:Ls8/k$d$a;

.field public static final enum p:Ls8/k$d$a;

.field private static final synthetic q:[Ls8/k$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ls8/k$d$a;

    const-string v1, "TEXTURE_WITH_VIRTUAL_FALLBACK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls8/k$d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls8/k$d$a;->n:Ls8/k$d$a;

    new-instance v1, Ls8/k$d$a;

    const-string v3, "TEXTURE_WITH_HYBRID_FALLBACK"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ls8/k$d$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ls8/k$d$a;->o:Ls8/k$d$a;

    new-instance v3, Ls8/k$d$a;

    const-string v5, "HYBRID_ONLY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ls8/k$d$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ls8/k$d$a;->p:Ls8/k$d$a;

    const/4 v5, 0x3

    new-array v5, v5, [Ls8/k$d$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ls8/k$d$a;->q:[Ls8/k$d$a;

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

.method public static valueOf(Ljava/lang/String;)Ls8/k$d$a;
    .locals 1

    const-class v0, Ls8/k$d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls8/k$d$a;

    return-object p0
.end method

.method public static values()[Ls8/k$d$a;
    .locals 1

    sget-object v0, Ls8/k$d$a;->q:[Ls8/k$d$a;

    invoke-virtual {v0}, [Ls8/k$d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls8/k$d$a;

    return-object v0
.end method
