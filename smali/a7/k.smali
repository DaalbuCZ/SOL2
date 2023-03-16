.class public abstract enum La7/k;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La7/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:La7/k;

.field public static final enum p:La7/k;

.field public static final enum q:La7/k;

.field public static final enum r:La7/k;

.field public static final enum s:La7/k;

.field private static final synthetic t:[La7/k;


# instance fields
.field n:J


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, La7/k$a;

    const-string v1, "TERABYTES"

    const/4 v2, 0x0

    const-wide v3, 0x10000000000L

    invoke-direct {v0, v1, v2, v3, v4}, La7/k$a;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, La7/k;->o:La7/k;

    new-instance v1, La7/k$b;

    const-string v3, "GIGABYTES"

    const/4 v4, 0x1

    const-wide/32 v5, 0x40000000

    invoke-direct {v1, v3, v4, v5, v6}, La7/k$b;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, La7/k;->p:La7/k;

    new-instance v3, La7/k$c;

    const-string v5, "MEGABYTES"

    const/4 v6, 0x2

    const-wide/32 v7, 0x100000

    invoke-direct {v3, v5, v6, v7, v8}, La7/k$c;-><init>(Ljava/lang/String;IJ)V

    sput-object v3, La7/k;->q:La7/k;

    new-instance v5, La7/k$d;

    const-string v7, "KILOBYTES"

    const/4 v8, 0x3

    const-wide/16 v9, 0x400

    invoke-direct {v5, v7, v8, v9, v10}, La7/k$d;-><init>(Ljava/lang/String;IJ)V

    sput-object v5, La7/k;->r:La7/k;

    new-instance v7, La7/k$e;

    const-string v9, "BYTES"

    const/4 v10, 0x4

    const-wide/16 v11, 0x1

    invoke-direct {v7, v9, v10, v11, v12}, La7/k$e;-><init>(Ljava/lang/String;IJ)V

    sput-object v7, La7/k;->s:La7/k;

    const/4 v9, 0x5

    new-array v9, v9, [La7/k;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, La7/k;->t:[La7/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, La7/k;->n:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IJLa7/k$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, La7/k;-><init>(Ljava/lang/String;IJ)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La7/k;
    .locals 1

    const-class v0, La7/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La7/k;

    return-object p0
.end method

.method public static values()[La7/k;
    .locals 1

    sget-object v0, La7/k;->t:[La7/k;

    invoke-virtual {v0}, [La7/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La7/k;

    return-object v0
.end method


# virtual methods
.method public e(J)J
    .locals 2

    iget-wide v0, p0, La7/k;->n:J

    mul-long/2addr p1, v0

    sget-object v0, La7/k;->r:La7/k;

    iget-wide v0, v0, La7/k;->n:J

    div-long/2addr p1, v0

    return-wide p1
.end method
