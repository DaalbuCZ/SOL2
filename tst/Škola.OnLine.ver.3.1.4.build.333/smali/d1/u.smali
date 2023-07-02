.class public Ld1/u;
.super Ljava/text/DateFormat;
.source ""


# static fields
.field private static n:Ljava/util/Calendar;

.field private static o:Ljava/text/NumberFormat;

.field private static p:Ld1/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    sput-object v0, Ld1/u;->n:Ljava/util/Calendar;

    new-instance v0, Ljava/text/DecimalFormat;

    invoke-direct {v0}, Ljava/text/DecimalFormat;-><init>()V

    sput-object v0, Ld1/u;->o:Ljava/text/NumberFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/text/DateFormat;-><init>()V

    sget-object v0, Ld1/u;->o:Ljava/text/NumberFormat;

    iput-object v0, p0, Ljava/text/DateFormat;->numberFormat:Ljava/text/NumberFormat;

    sget-object v0, Ld1/u;->n:Ljava/util/Calendar;

    iput-object v0, p0, Ljava/text/DateFormat;->calendar:Ljava/util/Calendar;

    return-void
.end method

.method public static c()Ld1/u;
    .locals 2

    sget-object v0, Ld1/u;->p:Ld1/u;

    if-nez v0, :cond_1

    const-class v0, Ld1/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ld1/u;->p:Ld1/u;

    if-nez v1, :cond_0

    new-instance v1, Ld1/u;

    invoke-direct {v1}, Ld1/u;-><init>()V

    sput-object v1, Ld1/u;->p:Ld1/u;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Ld1/u;->p:Ld1/u;

    return-object v0
.end method


# virtual methods
.method public format(Ljava/util/Date;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;
    .locals 0

    const/4 p3, 0x1

    invoke-static {p1, p3}, Ld1/r2;->b(Ljava/util/Date;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-object p2
.end method

.method public parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/text/ParsePosition;->setIndex(I)V

    invoke-static {p1}, Ld1/r2;->d(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method
