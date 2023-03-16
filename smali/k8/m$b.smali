.class public final enum Lk8/m$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk8/m$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lk8/m$b;

.field public static final enum p:Lk8/m$b;

.field private static final synthetic q:[Lk8/m$b;


# instance fields
.field public n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lk8/m$b;

    const-string v1, "light"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lk8/m$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk8/m$b;->o:Lk8/m$b;

    new-instance v1, Lk8/m$b;

    const-string v3, "dark"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v3}, Lk8/m$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lk8/m$b;->p:Lk8/m$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lk8/m$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lk8/m$b;->q:[Lk8/m$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lk8/m$b;->n:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lk8/m$b;
    .locals 1

    const-class v0, Lk8/m$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk8/m$b;

    return-object p0
.end method

.method public static values()[Lk8/m$b;
    .locals 1

    sget-object v0, Lk8/m$b;->q:[Lk8/m$b;

    invoke-virtual {v0}, [Lk8/m$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk8/m$b;

    return-object v0
.end method
