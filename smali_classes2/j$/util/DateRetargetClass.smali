.class public final synthetic Lj$/util/DateRetargetClass;
.super Ljava/lang/Object;


# direct methods
.method public static toInstant(Ljava/util/Date;)Lj$/time/Instant;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lj$/time/Instant;->s(J)Lj$/time/Instant;

    move-result-object p0

    return-object p0
.end method
