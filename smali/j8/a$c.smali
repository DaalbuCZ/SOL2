.class public final enum Lj8/a$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj8/a$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lj8/a$c;

.field public static final enum p:Lj8/a$c;

.field public static final enum q:Lj8/a$c;

.field private static final synthetic r:[Lj8/a$c;


# instance fields
.field public final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lj8/a$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lj8/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lj8/a$c;->o:Lj8/a$c;

    new-instance v1, Lj8/a$c;

    const-string v3, "POSTURE_FLAT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lj8/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lj8/a$c;->p:Lj8/a$c;

    new-instance v3, Lj8/a$c;

    const-string v5, "POSTURE_HALF_OPENED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lj8/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lj8/a$c;->q:Lj8/a$c;

    const/4 v5, 0x3

    new-array v5, v5, [Lj8/a$c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lj8/a$c;->r:[Lj8/a$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lj8/a$c;->n:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj8/a$c;
    .locals 1

    const-class v0, Lj8/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj8/a$c;

    return-object p0
.end method

.method public static values()[Lj8/a$c;
    .locals 1

    sget-object v0, Lj8/a$c;->r:[Lj8/a$c;

    invoke-virtual {v0}, [Lj8/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj8/a$c;

    return-object v0
.end method
