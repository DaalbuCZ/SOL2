.class public final Ls1/u1$e;
.super Ls1/u1$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final u:Ls1/u1$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/u1$d$a;

    invoke-direct {v0}, Ls1/u1$d$a;-><init>()V

    invoke-virtual {v0}, Ls1/u1$d$a;->g()Ls1/u1$e;

    move-result-object v0

    sput-object v0, Ls1/u1$e;->u:Ls1/u1$e;

    return-void
.end method

.method private constructor <init>(Ls1/u1$d$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ls1/u1$d;-><init>(Ls1/u1$d$a;Ls1/u1$a;)V

    return-void
.end method

.method synthetic constructor <init>(Ls1/u1$d$a;Ls1/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/u1$e;-><init>(Ls1/u1$d$a;)V

    return-void
.end method
