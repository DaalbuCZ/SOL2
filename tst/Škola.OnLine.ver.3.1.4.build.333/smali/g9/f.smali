.class final Lg9/f;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lg9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg9/f;

    invoke-direct {v0}, Lg9/f;-><init>()V

    sput-object v0, Lg9/f;->a:Lg9/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lg9/e;
    .locals 4

    new-instance v0, Lg9/e;

    const/4 v1, 0x1

    const/4 v2, 0x7

    const/16 v3, 0x16

    invoke-direct {v0, v1, v2, v3}, Lg9/e;-><init>(III)V

    return-object v0
.end method
