.class final Lu1/z$i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation


# instance fields
.field public final a:Ls1/o2;

.field public final b:Z

.field public final c:J

.field public final d:J


# direct methods
.method private constructor <init>(Ls1/o2;ZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/z$i;->a:Ls1/o2;

    iput-boolean p2, p0, Lu1/z$i;->b:Z

    iput-wide p3, p0, Lu1/z$i;->c:J

    iput-wide p5, p0, Lu1/z$i;->d:J

    return-void
.end method

.method synthetic constructor <init>(Ls1/o2;ZJJLu1/z$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lu1/z$i;-><init>(Ls1/o2;ZJJ)V

    return-void
.end method
